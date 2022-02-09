public class Caminhao {
    private double velocidade;
    private String descricao;
    private int ano, cargasuportada, valor, comprimento;

    public Caminhao(double velocidade, String descricao, int ano, int cargasuportada, int valor, int comprimento) {
        this.velocidade = velocidade;
        this.descricao = descricao;
        this.ano = ano;
        this.cargasuportada = cargasuportada;
        this.valor = valor;
        this.comprimento = comprimento;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCargasuportada() {
        return cargasuportada;
    }

    public void setCargasuportada(int cargasuportada) {
        this.cargasuportada = cargasuportada;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ano;
        result = prime * result + cargasuportada;
        result = prime * result + comprimento;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + valor;
        long temp;
        temp = Double.doubleToLongBits(velocidade);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Caminhao other = (Caminhao) obj;
        if (ano != other.ano)
            return false;
        if (cargasuportada != other.cargasuportada)
            return false;
        if (comprimento != other.comprimento)
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (valor != other.valor)
            return false;
        if (Double.doubleToLongBits(velocidade) != Double.doubleToLongBits(other.velocidade))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Caminhao [ano=" + ano + ", cargasuportada=" + cargasuportada + ", comprimento=" + comprimento
                + ", descricao=" + descricao + ", valor=" + valor + ", velocidade=" + velocidade + "]";
    }

    
}
