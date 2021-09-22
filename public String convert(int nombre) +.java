public String convert(int nombre) { 
  ResultatBuilder resultat = new ResultatBuilder(nombre); 
  for (RomanLiteral literal : RomanLiteral.literalsDecrementOrder()) { 
    resultat.compute(literal); 
  } 
  return resultat.toString(); 
}