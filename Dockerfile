###############################################################
#               Dockerfile to Deploy                          #
# 'target/calculator-1.0-SNAPSHOT.jar'                        #
#  into '/ubuntu_18.04.3_lts-openjdk_1.8.0_242' Docker Image  #
###############################################################

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