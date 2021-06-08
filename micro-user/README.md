Micro User app
--------------

This micro application is synchronizing users with keycloak but also manage companies relationships.

You will need a keycloak instance as well as the following services up and running :

- git server (config-repo)
- spring-config
- eureka
- keycloak
- user db

# Use cases

A user may register onto Keycloak to get an admin role.

That user will then be synchronized with the micro app from which additional users can be registered under a company.

Those additional users will be synchronized with keycloak and the time they try to login they will need to set their
credentials.

An admin user can register a company with its details. By default a journal will be linked to the company.

# Keycloak SYNC

# User rights

An admin can list all users belonging to same company.

# Endpoints tests

> curl http://localhost:9001/users

Without an access token you won't be able to access the route.

## Generate access token

curl --location --request POST 'http://localhost:8090/auth/realms/TEST/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'client_id=simple-app' \
--data-urlencode 'username=eddy' \
--data-urlencode 'password=bouge' \
--data-urlencode 'grant_type=password'

Now use the token to access the later endpoint :

curl --location --request GET 'http://localhost:9001/users' \
--header 'Authorization: Bearer
eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJYN0lpUUcwV1VWNzczSmR4WWR2T25ZRks0SGVnZ2hQZ2VkdXFrQll1SFFnIn0.eyJleHAiOjE2MjA5MzMwODEsImlhdCI6MTYyMDkzMjc4MSwianRpIjoiYTk5OTY1OTktNzgxYS00YmU3LWExYWItNGYzOWMxMmY1N2E4IiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDkwL2F1dGgvcmVhbG1zL1RFU1QiLCJhdWQiOlsibWljcm8tYXBwIiwiYWNjb3VudCJdLCJzdWIiOiJiNDQzN2ViZS1mOTViLTQ0Y2ItOWRlZC0zMTMyYjc5YjE4NjAiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJzaW1wbGUtYXBwIiwic2Vzc2lvbl9zdGF0ZSI6ImQ0MGVjMGViLTE2NWItNDc0YS04ZGM1LTEzNjQ5YzRlZDMxNiIsImFjciI6IjEiLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsib2ZmbGluZV9hY2Nlc3MiLCJ1bWFfYXV0aG9yaXphdGlvbiIsInVzZXIiXX0sInJlc291cmNlX2FjY2VzcyI6eyJtaWNyby1hcHAiOnsicm9sZXMiOlsidXNlciJdfSwiYWNjb3VudCI6eyJyb2xlcyI6WyJtYW5hZ2UtYWNjb3VudCIsIm1hbmFnZS1hY2NvdW50LWxpbmtzIiwidmlldy1wcm9maWxlIl19fSwic2NvcGUiOiJlbWFpbCBwcm9maWxlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJlZGR5In0.NvacVgOj5WMtmJfeu9mdbfdY0wmSQ5MTQ9Ks3zX3hD40NMeYe8z8HXlNWVHX-7_zUWHBy3Cqmqz7i4mdUfE6AApdTQ45WbXLZY_mEYH0oN9pBsTBjNnSzbwlCWCo9y40khDnYvH0ZAglIAoJ99-KH_isY-uc12BvE0wPSGIiAdMovIXaKuKiYn2ZO_hQPdbR4CoxcXHH3UTLJUdVnHI854x9-5eDDUVtcJNpBL2BZFdB1SO-mWUl9oaJjllKglX9LAzcJpExsBZbfJV1ublYquR1bQX3XEj8B1WSAKLZqw2Pn8dMQ2ek17T8EWfH_4SFvrFB0wn_Gb4SAgSt5hMUWw'


