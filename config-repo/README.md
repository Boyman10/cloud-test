REPO for Cloud test Config server
---------------------------------

Featuring the Gog docker Git server.

https://github.com/gogs/gogs/tree/main/docker

# Start the server :

## Use `docker run` for the first time.

$ docker run --name=gogs -p 10022:22 -p 10080:3000 -v /var/gogs:/data gogs/gogs

## Use `docker start` if you have stopped it.

$ docker start gogs

# using docker compose

Linked to postgres

# Access the server :

http://localhost:10080/

User : test pass : test

# Set up a repo :

cloud-config repo created -

git remote add origin http://localhost:10800/test/cloud-config.git
