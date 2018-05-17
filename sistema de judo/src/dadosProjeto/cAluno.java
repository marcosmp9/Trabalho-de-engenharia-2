package dadosProjeto;

public class cAluno {
    private String nomeAluno;
    private int CPF;
    private float peso;
    private String email;
    private int tel;
    private int cel;       

    public cAluno(){

    }

    public cAluno(String nomeAluno, int CPF, float peso, String email, int tel, int cel) {
        this.nomeAluno = nomeAluno;
        this.CPF = CPF;
        this.peso = peso;
        this.email = email;
        this.tel = tel;
        this.cel = cel;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    void add(cAluno aluno) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}