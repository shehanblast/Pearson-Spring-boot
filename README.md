# Country Backend Application

Country is a Spring backend application which can be used to manage (Create,
Read, Update, Delete) countries details. 

## Run the application

Download the zip folder/clone import to your IDE and run the spring boot application. 

```bash
File -> Import -> Existing Maven Projects -> Next -> Browse -> Select the folder spring- spring-boot-application-run -> Select Folder -> Finish
```

## Testing API

Testing API with talend API Tester.

GET Request 

```bash
curl -i -X GET \
   -H "Origin:http://localhost:4200" \
 'http://localhost:8080/rest/v2/jpa/countries'
 ```
 
 Response
 
 ```bash
Vary:	Origin
Vary:	Access-Control-Request-Method
Vary:	Access-Control-Request-Headers
Access-Control-Allow-Origin:	http://localhost:4200
Content-Type:	application/json
Transfer-Encoding:	chunked
Date:	
Tue, 16 Feb 2021 05:55:01 GMT-1s
Keep-Alive:	timeout=60
Connection:	keep-alive

[
{
"id": 1,
"username": "con",
"name": "Sri Lanka",
"capital": "Colombo",
"language": "Sinhala",
"currency": "Rupees",
"population": 22,
"president": "Gotabaya Rajapakshaa"
},
{
"id": 2,
"username": "con",
"name": "USA",
"capital": "New York",
"language": "English",
"currency": "Dollar",
"population": 328,
"president": "Joe Biden"
}
]
 ```
 
 DELETE Request 
 
 Request 
 
 ```bash
curl -i -X DELETE \
   -H "Origin:http://localhost:4200" \
 'http://localhost:8080/rest/v2/jpa/con/countries/2'
 ```
 
PUT Request 

```bash
curl -i -X PUT \
   -H "Origin:http://localhost:4200" \
   -H "Content-Type:application/json" \
   -d \
'
\
 'http://localhost:8080/rest/v2/jpa/con/countries/1'
 ```
 
 Response
 
 ```bash
{
"id": 1,
"username": "con",
"name": "Sri Lanka",
"capital": "Panadura",
"language": "Sinhala",
"currency": "Rupees",
"population": 22,
"president": "Gotabaya Rajapakshaa"
}' 
 ```
POST Request 

```bash
curl -i -X POST \
   -H "Origin:http://localhost:4200" \
   -H "Content-Type:application/json" \
   -d \
'
 \
 'http://localhost:8080/rest/v2/jpa/con/countries'
 ```
 
 Response
 
 ```bash
{
"username": "con",
"name": "Russia",
"capital": "Moscow",
"language": "Russian",
"currency": "ruble",
"population": 144.4,
"president": "Vladimir Putin"
}'
 ```
 
## Contact

Binuka Sihan Paranagama : https://www.linkedin.com/in/binuka-sihan-paranagama-636831194/

Project Link : 
