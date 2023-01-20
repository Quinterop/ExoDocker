#EX1

FROM java:8
COPY /path/to/jarfile.jar app.jar
WORKDIR /app
RUN chmod +x app.jar
CMD ["java", "-jar", "app.jar"]

#EX2

# step 1
FROM node:10 AS build
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build

# step 2
FROM node:10
COPY --from=build /app/dist/ /app
CMD ["npm", "start"]
