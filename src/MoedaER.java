public record MoedaER(Double conversion_rate, Double conversion_result) {

    public Double getConversionResult(){
        return conversion_result;
    }
}
