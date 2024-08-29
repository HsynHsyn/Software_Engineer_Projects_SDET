package Muhtar_SDET.Day16_nestedLoop_loopsContinue;

public class Task10_alphabets {
    public static void main(String[] args) {
      //nested for loop
        for (char i = 'A'; i <= 'E' ; i++) { // A to E char letters
            for (char j = 'a'; j <= 'z' ; j++) { // a to z char letters
                System.out.print("" + i + j + " "); // i and j values changes to string values, (i + j ) values is a integer
            }
            System.out.println();

        }
    }
}
/*
Create a class named Alphabets and use a nested loop to print the following output:

		Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
		Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
		Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
		Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
		Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez

 */
