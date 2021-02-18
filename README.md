spring cloud integration with consul configuration 
1. download consul server - https://www.consul.io/downloads.html
2. extract into your local directory
3. run in local development mode 
         consul agent -dev
4. clone this project
5. run SpringCloudConsulPocApplication as spring boot application
6. goto browser and type the following url
    http://localhost:8500
7. click on Key/Value tab
8. click Create button
9. Enter key as 
          config/spring-config-consul/first/rest/input
   value as 
        MyFirstValue
        
 10. open the browser and type the following url
 http://localhost:8080/getConsulValue
        
