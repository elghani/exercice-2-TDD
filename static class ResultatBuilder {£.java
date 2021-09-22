static class ResultatBuilder { 
 int reste; 
 StringBuilder resultat = new StringBuilder(); 

 public ResultatBuilder(int reste) { 
   super(); 
   this.reste = reste; 
 }   

 public void append(String name) { 
   resultat.append(name); 
 }   

 public String format() { 
   return resultat.toString(); 
 }   

 public void compute(RomanLiteral literal) { 
   while (reste >= literal.value) { 
     append(literal.name()); 
     reste -= literal.value; 
   } 
 } 
} 