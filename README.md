# projeto-backend-n2

### 1. Clone o repositório

### git clone https://github.com/lipeguizzo/projeto-backend-n2
### cd projeto-backend-n2

### 2. Configurar as variáveis de ambiente
## .env
PORT=8080

### 3. Subir os containers
docker-compose up --build

### Rotas da API

#### 1. GET /sobre
   Retorna nome do projeto e do aluno

#### 2. GET /clima/{city}
   Retorna dados de previsão do tempo da cidade informada
   
   Parametro: criciuma

#### 3. POST /clima
   Retorna dados de geocodificação da cidade informada
   
   Parametro: {
        "city": "criciuma"
   }

   
   



