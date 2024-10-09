#!/bin/bash

if [ ! -f ".env" ]; then
  cp .env.example .env
fi

./mvnw dependency:go-offline

./mvnw spring-boot:run