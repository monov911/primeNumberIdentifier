# Prime Number Identifier
An app to receive numbers through HTTP request and write the prime ones in a CSV file

# How to run
## Prerequisites
#### -Docker installed  [Docker download](https://www.docker.com/)

## Steps
Run the following commands as ordered in the CMD of the root folder of this project

`docker build -f Dockerfile -t prime_number_dentifier .`

`docker run -p 0.0.0.0:8091:8091 prime_number_dentifier .`

