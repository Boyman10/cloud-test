Micro User app
--------------

This micro application is synchronizing users with keycloak but also manage companies relationships.

# Use cases

A user may register onto Keycloak to get an admin role. That user will then be synchronized with the micro app from
which additional users can be registered under a company. those additional users will be synchronized with keycloak and
the time they try to login they will need to set credentials.

# Keycloak SYNC

# User rights

An admin can list all users belonging to same company.

# Endpoints test

> curl http://localhost:9001/users

With authentication :

> curl --location --request GET 'http://localhost:9001/users' \
--header 'Authorization: Bearer eyJhbGcqdfljdqlhflhfds...'

