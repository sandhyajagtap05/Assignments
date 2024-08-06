API Endpoints
Below are the API endpoints available in this project:
for student:
1] add student:
url:http://localhost:8080/students
Method: POST
body:{
    "name": "sandhya",
    "address": "Satara",
    "subjects": [
{
       "id": 1,
            "name": "Java"
        }
 ]
}


2] get student:

URL:http://localhost:8080/students
Method:Get
body:none in body

Response:
[
    {
        "id": 1,
        "name": "sandhya",
        "address": "Satara",
        "subjects": [
            {
                "id": 1,
                "name": "Java"
            }
        ]
    }
]




for subject:

1] add subject:
url:http://localhost:8080/subject
Method: POST
body:{
    "id": 1,
    "name": "Science"
}

2] get student:

URL:http://localhost:8080/student
Method:Get
body:none in body

Response:
body:{
    "id": 1,
    "name": "Science"
}


output:

creating 3 rd table in database and adding student id and subject id in 3 rd table 


