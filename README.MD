Assesment:

A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.
A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent between $50 and $100 in each transaction.
(e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).

 Given a record of every transaction during a three-month period, calculate the reward points earned for each customer per month and the total.

 Solve using Spring Boot
Create a RESTful endpoint
Make up a data set to best demonstrate your solution
Check the solution into GitHub


Solution:

Reward Application using Spring Boot Web Restful
- Java 17 has been used to develop this project.
- Assuming your tomcat runs on port 8080)
- The application can be accessed via http://localhost:8080/getrewards/1 which gives the  customer's (customer id is 1) Reward points in the last three month transaction
--http://localhost:8080/getpointrewards/2  which gives the  customer's (customer id is 2) Reward points in the last three month transaction
--http://localhost:8080/getpointrewards/3  which gives the  customer's (customer id is 3) Reward points in the last three month transaction
-Here is the mock data used (  

""[{"customerID":"1","customerName":"Ramya","transVO":[{"transactionID":1,"transactionDate":"2022-08-11","amount":20},{"transactionID":2,"transactionDate":"2022-09-12","amount":200},{"transactionID":3,"transactionDate":"2022-10-24","amount":200},{"transactionID":4,"transactionDate":"2022-11-30","amount":700},{"transactionID":5,"transactionDate":"2022-12-02","amount":70}]},{"customerID":"2","customerName":"Subramaniyan","transVO":[{"transactionID":1,"transactionDate":"2022-08-11","amount":220},{"transactionID":2,"transactionDate":"2022-08-25","amount":70},{"transactionID":3,"transactionDate":"2022-09-12","amount":200},{"transactionID":4,"transactionDate":"2022-10-24","amount":11},{"transactionID":5,"transactionDate":"2022-11-30","amount":72}]},{"customerID":"3","customerName":"Ram","transVO":[{"transactionID":1,"transactionDate":"2022-09-11","amount":70},{"transactionID":2,"transactionDate":"2022-09-25","amount":70},{"transactionID":3,"transactionDate":"2022-10-12","amount":200},{"transactionID":4,"transactionDate":"2022-10-24","amount":70},{"transactionID":5,"transactionDate":"2022-11-30","amount":70}]}]     ) ""


-Sample Output data looks like (Customer1 has total reward of 1770)
