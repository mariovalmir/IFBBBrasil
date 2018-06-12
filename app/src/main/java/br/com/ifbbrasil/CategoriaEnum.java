package br.com.ifbbrasil;

public enum CategoriaEnum {
    BODYBUILDING,
    CLASSICO,
    BIKINI(),
    WELLNESS,
    MENS_PHYSIQUE,
    MUSCULAR_PHYSIQUE,
    WOMANS_PHYSIQUE;


    public static CategoriaEnum fromCodigo(int codigo){
        for (CategoriaEnum categoria: CategoriaEnum.values()  ) {
            if(categoria.ordinal() == codigo){
                return categoria;
            }
        }
        return null;
    }

}
