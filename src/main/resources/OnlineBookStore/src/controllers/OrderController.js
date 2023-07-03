import axios from 'axios';

class OrderController{
    index(req, res, next)  {
        res.render('order', {scripts: '<script src="../js/order.js"></script>'})
    }

    async history(req, res, next)  {
        let orderId = req.query.id;
        const orderDetails = await axios({ method: 'get', url: 'http://localhost:8080/api/order_s/' + orderId + '/orderDetails', responseType: 'json', headers: { 'Content-Type': 'application/json' } });
        // console.log(orderDetails.data._embedded.orderDetails)
        let data = orderDetails.data._embedded.orderDetails;
        res.render('order_history', {scripts: '<script src="../js/order_history.js"></script>', orderDetails: data})
    }
}

export default new OrderController; 

