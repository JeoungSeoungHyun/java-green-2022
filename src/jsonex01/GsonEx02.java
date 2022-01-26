package jsonex01;

import com.google.gson.Gson;

class Dto {
    private String groueld;
    private int succeessCount;
    private int failCount;

    public Dto(String groueld, int succeessCount, int failCount) {
        this.groueld = groueld;
        this.succeessCount = succeessCount;
        this.failCount = failCount;
    }

    public String getGroueld() {
        return groueld;
    }

    public void setGroueld(String groueld) {
        this.groueld = groueld;
    }

    public int getSucceessCount() {
        return succeessCount;
    }

    public void setSucceessCount(int succeessCount) {
        this.succeessCount = succeessCount;
    }

    public int getFailCount() {
        return failCount;
    }

    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }

    @Override
    public String toString() {
        return "Dto [failCount=" + failCount + ", groueld=" + groueld + ", succeessCount=" + succeessCount + "]";
    }
}

public class GsonEx02 {
    // "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
    public static void main(String[] args) {
        Dto data = new Dto("R2GdEONszq64lNB9", 1, 0);
        Gson gson = new Gson();

        String jsonDto = gson.toJson(data);
        System.out.println(jsonDto);

        Dto javaDto = gson.fromJson(jsonDto, Dto.class);
        System.out.println(javaDto);
    }
}
