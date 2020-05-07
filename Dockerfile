#########################################################################
# Creating Docker Image to deploy  'target/calculator-1.0-SNAPSHOT.jar' #
#  from 'henil2097/ubuntu_18.04.3_lts-openjdk_1.8.0_242' base Image     #
#########################################################################

# use the base image
FROM henil2097/ubuntu_18.04.3_lts-openjdk_1.8.0_242

# File Author
MAINTAINER Henil_Patel

# expose port
EXPOSE 8080

# Add files from the host into the container dest. path
ADD target/calculator-1.0-SNAPSHOT.jar .

# Default container command
ENTRYPOINT ["/usr/bin/java", "-cp", "calculator-1.0-SNAPSHOT.jar", "com/calculator/Calculator"]

# CMD line input
CMD ["10" , "*" , "25"]