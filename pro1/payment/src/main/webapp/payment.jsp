<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="payment.css">
</head>
<body>
   <div class="container">

        <form action="/pay" method="post">

            <div class="row">

                <div class="col">

                    <h3 class="title">payment information</h3>

                    <div class="inputBox">
                        <span>Full name :</span>
                        <input type="text" name="pName" class="custom-placeholder" placeholder="janindu dulanjith jayasundara">
                    </div>
                    <div class="inputBox">
                        <span>Email :</span>
                        <input type="email" name="pemail" class="custom-placeholder" placeholder="@gmail.com">
                    </div>
                    <div class="inputBox">
                        <span>Address :</span>
                        <input type="text" name="pAddress" class="custom-placeholder" placeholder="No:/street,Road">
                    </div>
                    <div class="inputBox">
                        <span>City :</span>
                        <input type="text" name="pCity" class="custom-placeholder" placeholder="Galle">
                    </div>

                    <div class="flex">
                        <div class="inputBox">
                            <span>Country/Region :</span>
                            <input type="text" name="pCountry_Region" class="custom-placeholder" placeholder="Srilanka">
                        </div>
                        <div class="inputBox">
                            <span>Post code :</span>
                            <input type="text" name="pPostcode" class="custom-placeholder" placeholder="800901">
                        </div>
                    </div>

                </div>

                <div class="col">

                    <h3 class="title">Payment</h3>

                    <div class="inputBox">
                        <span>Cards accepted :</span>
                        <img src="Card logo.jpg" alt="">
                    </div>
                    <div class="inputBox">
                        <span>Name on card:</span>
                        <input type="text" name="pName_on_card"class="custom-placeholder" placeholder="jayasundara J D">
                    </div>
                    <div class="inputBox">
                        <span>Credit card number :</span>
                        <input type="text" name="pCredit_card_number" class="custom-placeholder" placeholder="xxxx-xxxx-xxxx-xxxx">
                    </div>
                    <div class="inputBox">
                        <span>Exp month :</span>
                        <input type="text" name="pExp_month" class="custom-placeholder" placeholder="january">
                    </div>

                    <div class="flex">
                        <div class="inputBox">
                            <span>Exp year :</span>
                            <input type="text" name="pExp_year" class="custom-placeholder" placeholder="2022">
                        </div>
                        <div class="inputBox">
                            <span>CVV :</span>
                            <input type="text" name="pCVV" class="custom-placeholder" placeholder="xxx">
                        </div>
                    </div>

                </div>

            </div>

            <input type="submit" value="proceed to checkout" class="submit-btn">
            
        </form>

    </div>
</body>
</html>