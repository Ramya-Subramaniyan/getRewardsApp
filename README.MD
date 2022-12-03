Reward Application using Spring Boot Web Restful
- Java 17 has been used to develop this project.
- Assuming your tomcat runs on port 8080)
- The application can be accessed via http://localhost:8080/getrewards/1 which gives the  customer's (customer id is 1) Reward points in the last three month transaction
--http://localhost:8080/getpointrewards/2  which gives the  customer's (customer id is 2) Reward points in the last three month transaction
--http://localhost:8080/getpointrewards/3  which gives the  customer's (customer id is 3) Reward points in the last three month transaction
-Here is the mock data (  

""[{"customerID":"1","customerName":"Ramya","transVO":[{"transactionID":1,"transactionDate":"2022-08-11","amount":20},{"transactionID":2,"transactionDate":"2022-09-12","amount":200},{"transactionID":3,"transactionDate":"2022-10-24","amount":200},{"transactionID":4,"transactionDate":"2022-11-30","amount":700},{"transactionID":5,"transactionDate":"2022-12-02","amount":70}]},{"customerID":"2","customerName":"Subramaniyan","transVO":[{"transactionID":1,"transactionDate":"2022-08-11","amount":220},{"transactionID":2,"transactionDate":"2022-08-25","amount":70},{"transactionID":3,"transactionDate":"2022-09-12","amount":200},{"transactionID":4,"transactionDate":"2022-10-24","amount":11},{"transactionID":5,"transactionDate":"2022-11-30","amount":72}]},{"customerID":"3","customerName":"Ram","transVO":[{"transactionID":1,"transactionDate":"2022-09-11","amount":70},{"transactionID":2,"transactionDate":"2022-09-25","amount":70},{"transactionID":3,"transactionDate":"2022-10-12","amount":200},{"transactionID":4,"transactionDate":"2022-10-24","amount":70},{"transactionID":5,"transactionDate":"2022-11-30","amount":70}]}]     ) ""


-Sample Output data looks like (Customer1 has total reward of 1770)
