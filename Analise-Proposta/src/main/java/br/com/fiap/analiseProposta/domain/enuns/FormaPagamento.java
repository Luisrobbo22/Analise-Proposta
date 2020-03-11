package br.com.fiap.analiseProposta.domain.enuns;

public enum FormaPagamento {
    A_VISTA("A VISTA0"),
    PARCELADO("PARCELADO");

    private int cod;
    private String formaPagamento;

        FormaPagamento(String formaPagamento) {
                this.formaPagamento = formaPagamento;
        }

        public String getFormaPagamento() {
                return formaPagamento;
        }

        public static FormaPagamento toEnum(String descricao){
                if (descricao == null){
                        return null;
                }

                for (FormaPagamento formaPagamento: FormaPagamento.values()) {
                        if (descricao.equals(formaPagamento.getFormaPagamento())){
                                return formaPagamento;
                        }
                }
                throw new IllegalArgumentException("Forma de pagamento inválida: " + descricao);
        }
}
