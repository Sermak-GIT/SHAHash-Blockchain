package shahash;
import java.util.Arrays;
/**
 *
 * @author Johannes
 */
public class Block {

    private int prevHash;
    private String[] preImage;
    private int digest;

    public Block(int prevHash, String[] preImage) {
        this.prevHash = prevHash;
        this.preImage = preImage;

        this.digest = Arrays.hashCode(new int[]{Arrays.hashCode(preImage), prevHash});


    }

    public int getPrevHash() {
        return prevHash;
    }

    public String[] getPreImage() {
        return preImage;
    }

    public int getDigest() {
        return digest;
    }
}

