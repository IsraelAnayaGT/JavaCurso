public class Oper_Comparacion {
    static void main() {
        int valor1 = 90, valor2 = 50;

        //Igualdad
        var resultado = valor1 == valor2;
        System.out.println(valor1+" Es igual a "+valor2+": "+resultado);

        //Diferente
        resultado = valor1!=valor2;
        System.out.println(valor1+" Es diferente a "+valor2+": "+resultado);

        //Mayor que
        resultado = valor1>valor2;
        System.out.println(valor1+" Es mayor que  "+valor2+": "+resultado);

        //Menor que
        resultado = valor1<valor2;
        System.out.println(valor1+" Es menor que  "+valor2+": "+resultado);

        //Menor o igual que
        resultado = valor1<=valor2;
        System.out.println(valor1+" Es menor o igual que  "+valor2+": "+resultado);

        //Mayor o igual que
        resultado = valor1>=valor2;
        System.out.println(valor1+" Es mayor o igual que  "+valor2+": "+resultado);

    }
}
