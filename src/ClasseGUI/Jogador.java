/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseGUI;


/**
 *
 * @author Yure Pablo
 */
public class Jogador {
    int vida = 100;
    int quant = 1;
    float resposta;
    int y = 540, x = 10;
    
    public void setVida(int v){
        vida = vida - v;
    }
    public int getVida(){
        return vida;
    }
    public void contar(){
        quant = quant + 1;
    }

    public int getQuant() {
        return quant;
    }
    public void Responder(){
       if (quant == 1){
          resposta = 0.5F;
       } 
       if (quant==2){
          resposta = 9.8641F; 
       }
       if (quant==3){
          resposta = 15.808F;
       }
       if(quant==4){
          resposta = 93.45F;
       }
       if(quant==5){
          resposta = 1.957F;
       }
       if(quant==6){
          resposta = 13.003F;
       }
       if(quant==7){
          resposta = 93600F;
       }
    }
    public float getResposta() {
        return resposta;
    }
    public void location(){
        if (quant<=2){
        y = y - 195;
        }
        if(quant==3){
          x = x+240;
        }
        if ((quant>=4) && (quant<=5)){
           y = y+228;
        }
        if (quant==6){
           x = x-240;
        }
        
    }
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
    
    public String Imprimir1(){
        switch(quant){
            case 1: return 
            " \n1. Verifique se a quantidade de casas decimais é a mesma!"
            + "\n2. Destrua a vírgula de ambos os lados!"
            + "\n3. Dica: 45/90" +
            "\n4. Quando o número é menor que o divisor, torne-o maior acrescentando 0!";
            case 2:
            return "1.	Iguale as casas decimais, utilizando 0!\n" +
            "2.	Multiplique os números por um número de base 10 que destrua a vírgula!\n" +
            "3.	Dica: 5,8765 * 10000 = 58765\n" +
            "4.	Agora coloque em forma de fração os números pelo mesmo número de base 10!";
            case 3: 
            return "1.	Iguale as casas decimais utilizando 0!\n" +
            "2.	Dica: 50,678 – 34,870\n" +
            "3.	Multiplique os números por um número de base 10 que destrua a vírgula\n" +
            "4.	Dica: 50,678*1000 =  50678.\n" +
            "5.	Agora coloque em forma de fração os números pelo mesmo número de base 10.";
            case 4:
            return "1. Iguale as casas decimais\n" +
            "2. Multiplique o número por um de base 10 da mesma quantidade de casas decimais!\n " +
            "3.	 Dica: 89*105";
            case 5:
            return "1.	Iguale as casas decimais, acrescentando 0\n" +
            "2.	Dica: 5,670 / 2,897\n" +
            "3.	Destrua a vírgula multiplicando ambos por um número de base 10 da mesma quantidade de casas decimais!\n" +
            "4.	Dica: 5670 / 2897";
            case 6:
                return "1. Priorize sempre as divisões e as multiplicações!\n" +
                "2. Então comece de trás para frente, multiplique 8 por 6.\n" +
                "3. Pegue (1/7) e divida pelo resultado de (8*6).\n" +
                "4. Subtraia 8-9 e multiplique pelo resultado alcançado no ponto 3 com 3 casas decimais.\n" +
                "5. Some 9 com 4 e subtraia pelo resultado do ponto 4.";
            case 7:
                return "1. Analise os dados da questão e a figura, porque já vamos entrar no conceito de função.\n" +
                "2. A largura é o lado menor e o comprimento é o lado maior.\n" +
                "3. O retângulo tem duas larguras e dois comprimentos.\n" +
                "4. Conclua que se ele percorreu 1260m, 2 larguras + dois comprimentos são iguais a 1260.\n" +
                "5. Como o comprimento é 1,625 maior que a largura, vamos chamar comprimento de C e largura de L, C = 1,625L";
            default: return null;
        }
    }
    public String Imprimir2(){
        switch(quant){
            case 1: 
                return "5.	Dica: 450/90\n" +
            "6.	Sempre que isso acontece, a resposta começará com (0,)\n" +
            "7.	Pense num número que multiplicado por 9 dá 45! \n" +
            "8.	Agora complete sua resposta: 0,...";
            case 2:
                return "5.	Dica: 58765/10000 + 39876/10000\n" +
            "6.	Some os números sem vírgula e depois coloque a vírgula novamente com a quantidade de casas decimais do início!\n" +
            "7.	Dica: 0,0000! \n" +
            "8.	Agora troque o 0 pelos números e acerte a questão!";
            case 3:
                return "6.	Dica: 50678/1000 – 34870/1000\n" +
            "7.	Subtraia os números sem vírgula e depois coloque a vírgula novamente com a quantidade de casas decimais do início!\n" +
            "8.	Dicas: Para subtrair um número menor que o outro, coloque um nele, e tire um do número do lado esquerdo.\n" +
            "9.	Exemplo: 5678 – 4870 = Observe o segundo algarismo dos dois números, 6<8, coloque 1 no 6, ficando 16, e tire 1 do 5, ficando 4, a resposta = 808. \n" +
            "10. Dica: 00,000! Agora troque o 0 pelos números e acerte a questão!";
            case 4:
                return "4.	Conte as casas decimais, nesse caso há uma em cada número, então sua resposta terá duas casas decimais!\n" +
            "5.	Quando receber a resposta da multiplicação, coloque a vírgula para ficar 2 casas decimais!\n" +
            "6.	Dica: 0000 = 00,00! \n" +
            "7.	Agora troque o 0 pelos números e acerte a questão!";
            case 5:
                return "5. Essa divisão gera um resto menor que o divisor, então sempre começa com (1,)\n" +
                "6. Sempre que o resto for menor, você acrescenta zero e divide, você pode repetir isso até três vezes. Então sua resposta terá três casas decimais!\n" +
                "7. Dica: o resto será 5670 – 2897 = 2773; acrescente 0 e torne ele maior que o divisor; 27730 / 2897, pense num número que multiplicado por 2897 dê perto de 27730, e depois repita o processo mais duas vezes.\n" +
                "8. Agora é sua vez!";
            case 6:
                return "6. Use todas as dicas dos outros desafios para resolver as operações!\n" +
                "7. Dicas extras: 1,456 / 450 = 1456 / 450000\n" +
                "8. Dicas extras: Sempre considere três casas decimais!\n" +
                "9. Dicas extras: Quando subtrair um número por um menor, subtraia o maior pelo menor e acrescente – do lado. Ex: 5 – 7 = - (7 – 5) = - 2" +
                "10. A resposta tem 5 casas decimais!";
            case 7:
                return "6. Então L + L + 1,625L + 1,625L = 1260\n" +
                "7. Como as letras são iguais, some os números, lembrando que L = 1L\n" +
                "8. Depois o número colado com L passa para baixo do 1260, então L é igual a 1260 dividido por esse número.\n" +
                "9. Sabendo – se que C = 1,265L, o comprimento é igual a 1,265 vezes o número encontrado no item 8.\n" +
                "10. A área do retângulo é comprimento vezes largura.\n" +
                "11. Agora é sua vez!";
            default: return null;
        }
  
    }
    
}
