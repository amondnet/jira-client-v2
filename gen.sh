java -jar openapi-generator-cli.jar generate \
    -i ./swagger.json \
    -g java \
    -o ./ \
    -c config.json