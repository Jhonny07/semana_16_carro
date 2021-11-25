public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Hyundai");
        carro.setModelo("Sonata");
        carro.setAno(2012);
        carro.setPlaca("JJJ4E77");
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println(carro.getAno());
        System.out.println(carro.getPlaca());
    }
}
