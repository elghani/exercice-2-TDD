public String convert(int nombre) {  
 if (nombre > 2) {  
   return "III";  
 } else if (nombre > 1) {  
   return "II";  
 }  
   return "I";  
}  

public String convert(int nombre) { 
 StringBuilder resultat = new StringBuilder();   

 for (int i = 0; i < nombre; i++) { 
   resultat.append("I"); 
 } 

 return resultat.toString(); 
}

public String convert(int nombre) {  
 StringBuilder resultat = new StringBuilder();    

 if (nombre >= 10) {  
   return "X";
 } else {  
   for (int i = 0; i < nombre; i++) {  
     resultat.append("I");  
   }  
 }  
return resultat.toString();  
} 
public String convert(int nombre) { 
 StringBuilder resultat = new StringBuilder();   

 if (nombre >= 10) { 
   for (int i = 0; i < nombre/10; i++) { 
     resultat.append("X"); 
   }  
 } else { 
   for (int i = 0; i < nombre; i++) { 
     resultat.append("I"); 
   } 
 } 

 return resultat.toString(); 
} 
public String convert(int nombre) { 
 StringBuilder resultat = new StringBuilder();   

 int reste = nombre;   

 while (reste >= 10) { 
   resultat.append("X"); 
   reste -= 10; 
 } 
 while (reste >= 1) { 
   resultat.append("I"); 
   reste -= 1; 
 }  

 return resultat.toString(); 
}
public String convert(int nombre) { 
 StringBuilder resultat = new StringBuilder();   

 if (nombre >= 10) { 
   for (int i = 0; i < nombre/10; i++) { 
     resultat.append("X"); 
   }  
 } else { 
   for (int i = 0; i < nombre; i++) { 
     resultat.append("I"); 
   } 
 } 

 return resultat.toString(); 
} 
