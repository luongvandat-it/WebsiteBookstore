$(document).ready(function () {
    loadBooks();
    async function loadBooks() {
        // let listBook = JSON.parse(localStorage.getItem("books"));
        console.log(window.location.search)
        let id = window.location.search;
        id = id.substring(id.lastIndexOf('=') + 1)
        console.log(id)
        let listBook;

        await $.ajax({
            url: "http://localhost:8080/api/order_s/" + id + "/orderDetails",
            type: "GET",
            dataType: "json",
            success: function (data) {
                listBook = data._embedded.orderDetails;
            },
            error: function (err) {
                // alert("Error: " + err.responseText);
                // alert("Please login to view order history")
            }
        });
        // http://localhost:8080/api/books/search/findBooksByBookIdBetween?low=B001&high=B001
        let content = "";
        let totalPrice = 0;
        let flag = true;

        content += '<div class="row mb-4 mb-md-3 border-bottom border-dark pb-3 mt-5">';
        content += '    <div class="col-md-8 col-9 fw-bold font-table-header">List Book (' + listBook.length + ' books)</div>';
        content += '    <div class="col-md-2 d-none d-md-block text-center fw-bold font-table-header">Quantity</div>';
        content += '    <div class="col-md-2 col-3 text-center fw-bold font-table-header">Total</div>';
        content += '</div>';

        console.log(listBook)
        for (let i = 0; i < listBook.length; i++) {
            let bookId = listBook[i]._links.book.href;
            bookId = bookId.substring(bookId.lastIndexOf('bookId=') + 7)
            bookId = bookId.replace(")/book", "")
            let book;
            await $.ajax({
                url: "http://localhost:8080/api/books/search/findBooksByBookIdBetween?low=" + bookId + "&high=" + bookId,
                type: "GET",
                dataType: "json",
                success: function (data) {
                    book = data._embedded.books;
                },
                error: function (err) {
                    // alert("Error: " + err.responseText);
                    // alert("Please login to view order history")
                }
            });
            totalPrice += parseFloat(listBook[i].price).toFixed(2) * listBook[i].quantity;
            content += ' <div class="row mb-4 mb-md-3">';
            content += '     <div class="col-md-8 col-9">';
            content += '         <div class="row">';
            content += '             <div class="col-md-2 col-3">';
            content += '                 <a href="/product/' + bookId + '" class=""><img src="' + book[0].bookImage + '" alt="Image" style="height: 15vh; width: 90%;object-fit: cover;"></a>';
            content += '             </div>';
            content += '             <div class="col d-flex flex-column justify-content-md-between justify-content-around">';
            content += '                 <b class="h6"><a href="/product/' + bookId + '" class="text-decoration-none text-dark">' + book[0].bookTitle + '</a></b>';
            content += '                 <div class="d-md-none d-block">';
            content += '                     <span>Quantity: ' + listBook[i].quantity + '</span>';
            content += '                 </div>';
            content += '                 <div class="text-danger h6">' + listBook[i].price + ' $</div>';
            content += '             </div>';
            content += '         </div>';
            content += '     </div>';
            content += '     <div class="col-md-2 d-none d-md-block text-center align-self-center">';
            content += '         <div class="d-flex justify-content-center">';
            content += '             <span class="mx-md-3">' + listBook[i].quantity + '</span>';
            content += '         </div>';
            content += '     </div>';
            content += '     <div class="col-md-2 col-3 text-center align-self-center text-danger h6">' + (parseFloat(listBook[i].price).toFixed(2) * listBook[i].quantity) + ' $</div>';
            content += ' </div>';
        }
        content += '<div class="d-flex justify-content-end"><div class="h5"><span>Total order: </span><span class="text-danger" id="total-price">' + totalPrice.toFixed(2) + '</span><span class="text-danger"> $</span></div></div>';
        localStorage.setItem("totalPriceInCart", totalPrice.toFixed(2));
        $("#list_product").append(content);
    }
})
