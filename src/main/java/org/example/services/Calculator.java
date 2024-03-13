package org.example.services;

//Clasa = unitatea principala in care definim un obiect
//Clasa de obiect = schita unui obiect pe care il putem caracteriza dupa diverse trasaturi sau comportamente
public class Calculator {
    //Atribute =  trasaturile caracteristice ale unui obiect
    public String tipCalculator;

    //Constructor = mechanism de intitializare obiect in fctie de atributele clasei
    //default = neparametrizat, scopul lui este de a seta niste informatii generale pt atribute
    public Calculator() {
        this.tipCalculator = "";

    }

    // parametrizat, scopul lui este de a seta niste informatii specifice din start
    public Calculator(String tipCalculator) {
        this.tipCalculator = tipCalculator;

    }

    //  comportament = o serie de metode care definesc fctionaliatea clasei
    public float sum(float a, float b) {
        float result = a + b;
        return result;
    }

    public float substract(float a, float b) {
        float result = a - b;
        return result;
    }

    public float divide(float a, float b) {
        float result = a / b;
        return result;
    }

    public float multiply(float a, float b) {
        float result = a * b;
        return result;
    }
}
