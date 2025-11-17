/*
DECLARACION DE VARIABLES, aqui utilizamos los dos primeros leds y los dos botones, segun los que nos indique la tabla de atras que sale 
*/
int led1=9;
int led2=10;
int boton1=7;
int boton2=8;

int estadoBoton1=LOW;
int estadoBoton2=LOW;

void setup() {

pinMode(boton1,INPUT);
pinMode(boton2,INPUT);
pinMode(led1,OUTPUT);
pinMode(led2,OUTPUT);
}

void loop() {
  estadoBoton1 = digitalRead(boton1); 
  estadoBoton2 = digitalRead(boton2);
      
  if(estadoBoton1==HIGH){
    digitalWrite(led1,LOW);
  }
  else if(estadoBoton2){
    digitalWrite(led2,HIGH);
  }
  else{
    digitalWrite(led1,HIGH);
    digitalWrite(led2,LOW);
  }
}
