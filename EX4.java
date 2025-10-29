public class EX4 {
    
    public static void main( String[] args) {
        int t[] = {15, 8, 19, 12,20, 14, 5};
        int somme =0;
        for(int i=0; i < t.length ;i++){
        somme+=t[i];
        } 
        System.out.println("La somme des éléments du tableau est : " + somme);
        System.out.println("La moyenne des éléments du tableau est : " + somme/t.length);

}
}
