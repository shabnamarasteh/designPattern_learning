package ir.learn.creational.builder;

public class H264PropertiesBuilder {
    private int keyInt;
    private int minKeyInt;
    private int sceneCut;
    private int bFrames;
    private int bAdapt;
    private int dp;
    private int brate;
    private boolean bFrameBias;
    private int crf;
    private int qpStep;
    private int pbRatio;
    private int chromaOffset;
    private float rateTol;
    private byte pass;
    private boolean stats;
    private int direct;
    private int meRange;
    private boolean weightB;

    public H264PropertiesBuilder keyInt(int keyInt) {
        this.keyInt = keyInt;
        return this;
    }

    public H264PropertiesBuilder minKeyInt(int minKeyInt) {
        this.minKeyInt = minKeyInt;
        return this;
    }

    public H264PropertiesBuilder sceneCut(int sceneCut) {
        this.sceneCut = sceneCut;
        return this;
    }

    public H264PropertiesBuilder bFrames(int bFrames) {
        this.bFrames = bFrames;
        return this;
    }

    public H264PropertiesBuilder bAdapt(int bAdapt) {
        this.bAdapt = bAdapt;
        return this;
    }

    public H264PropertiesBuilder dp(int dp) {
        this.dp = dp;
        return this;
    }

    public H264PropertiesBuilder brate(int brate) {
        this.brate = brate;
        return this;
    }

    public H264PropertiesBuilder bFrameBias(boolean bFrameBias) {
        this.bFrameBias = bFrameBias;
        return this;
    }

    public H264PropertiesBuilder crf(int crf) {
        this.crf = crf;
        return this;
    }

    public H264PropertiesBuilder qpStep(int qpStep) {
        this.qpStep = qpStep;
        return this;
    }

    public H264PropertiesBuilder pbRatio(int pbRatio) {
        this.pbRatio = pbRatio;
        return this;
    }

    public H264PropertiesBuilder chromaOffset(int chromaOffset) {
        this.chromaOffset = chromaOffset;
        return this;
    }

    public H264PropertiesBuilder rateTol(float rateTol) {
        this.rateTol = rateTol;
        return this;
    }

    public H264PropertiesBuilder pass(byte pass) {
        this.pass = pass;
        return this;
    }

    public H264PropertiesBuilder stats(boolean stats) {
        this.stats = stats;
        return this;
    }

    public H264PropertiesBuilder direct(int direct) {
        this.direct = direct;
        return this;
    }

    public H264PropertiesBuilder meRange(int meRange) {
        this.meRange = meRange;
        return this;
    }

    public H264PropertiesBuilder weightB(boolean weightB) {
        this.weightB = weightB;
        return this;
    }

    public H264Properties build(){
        H264Properties h264Properties = new H264Properties();
        h264Properties.setbAdapt(this.bAdapt);
        //...
        return h264Properties;
    }
}
