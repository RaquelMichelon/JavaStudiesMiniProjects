public interface Operate {
    Double getResult(Double... numbers); //... is a var arg expression, which means that numbers will be an array of arbitrary length
}
