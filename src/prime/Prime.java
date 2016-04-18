/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;
public class Prime {
    
    public static void main(String[] args) {
        for (int i = 0;i<100;i++){
            Prime Oprime = new Prime();
            if (Oprime.IsPrime(i)==1){
                System.out.println(i);
            }
        }// TODO code application logic here
    }

    public int IsPrime(int a){
        for(int j = 2; j<a; j++){
            if (j%a!=0)
                return 0;
            
            else
                return 1;
            
        }
        return 0;
    }
}
    

