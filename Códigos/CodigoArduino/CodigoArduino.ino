int ler = 0;
int led = 11;



void setup() {
    pinMode(led,OUTPUT); 
    Serial.begin(9600);

}

void loop() {
    Serial.write("roberto ");
   ler = Serial.read();

   if(ler = 1){

digitalWrite(led,HIGH);
analogWrite(led,100);


   }

    delay(1000);

}