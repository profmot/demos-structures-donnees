
public static int rechercheBinaireRecursive(int[] tableau, int valeur, int debut, int fin) {


    {1:MCS:=if (debut > fin) &#123~while (debut <= fin) &#123~∅}

        {1:MCS:=return -1;~int milieu = (debut + fin) / 2;~∅}

    {1:MCS:=&#125;~∅}

    {1:MCS:=int milieu = (debut + fin) / 2;~∅}

    {1:MCS:=if (tableau[milieu] == valeur) &#123;~∅}

        {1:MCS:=return milieu;~∅}

    {1:MCS:=&#125;~∅}


    {1:MCS:=if (valeur < tableau[milieu]) &#123;~∅}

        {1:MCS:=return rechercheBinaireRecursive(tableau, valeur, debut, milieu - 1);~fin = milieu - 1;~∅}

    {1:MCS:=&#125 else &#123;~&#123;~∅}

        {1:MCS:=return rechercheBinaireRecursive(tableau, valeur, milieu + 1, fin);~debut = milieu + 1;~∅}  

    {1:MCS:=&#125;~&#125 else &#123;~∅}

    {1:MCS:=∅~&#125 else &#123}

    {1:MCS:=∅~return -1;}

}




