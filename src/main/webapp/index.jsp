<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 3/7/21
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2 style="text-align: center">Product Discount Calculator</h2>
  <form method="post" action="/productDiscount">
    <label>Product Description</label>
    <br>
    <textarea id="description" name="description" rows="10" cols="50"></textarea>
    <br>
    <label>List Price</label>
    <input type="text" name="list_price" placeholder="">
    <br>
    <label>Discount Percent</label>
    <input type="text" name="discount_percent" placeholder="">
    <br>
    <input type="submit" value="Submit" id="submit">
  </form>
  </body>
</html>
