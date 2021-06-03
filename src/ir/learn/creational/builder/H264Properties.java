package ir.learn.creational.builder;

public class H264Properties {
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

    public H264Properties() {
    }

    public H264Properties(int keyInt, int minKeyInt, int sceneCut, int bFrames, int bAdapt, int dp, int brate, boolean bFrameBias, int crf, int qpStep, int pbRatio, int chromaOffset, float rateTol, byte pass, boolean stats, int direct, int meRange, boolean weightB) {
        this.keyInt = keyInt;
        this.minKeyInt = minKeyInt;
        this.sceneCut = sceneCut;
        this.bFrames = bFrames;
        this.bAdapt = bAdapt;
        this.dp = dp;
        this.brate = brate;
        this.bFrameBias = bFrameBias;
        this.crf = crf;
        this.qpStep = qpStep;
        this.pbRatio = pbRatio;
        this.chromaOffset = chromaOffset;
        this.rateTol = rateTol;
        this.pass = pass;
        this.stats = stats;
        this.direct = direct;
        this.meRange = meRange;
        this.weightB = weightB;
    }

    public int getKeyInt() {
        return keyInt;
    }

    public H264Properties setKeyInt(int keyInt) {
        this.keyInt = keyInt;
        return this;
    }

    public int getMinKeyInt() {
        return minKeyInt;
    }

    public H264Properties setMinKeyInt(int minKeyInt) {
        this.minKeyInt = minKeyInt;
        return this;
    }

    public int getSceneCut() {
        return sceneCut;
    }

    public H264Properties setSceneCut(int sceneCut) {
        this.sceneCut = sceneCut;
        return this;
    }

    public int getbFrames() {
        return bFrames;
    }

    public H264Properties setbFrames(int bFrames) {
        this.bFrames = bFrames;
        return this;
    }

    public int getbAdapt() {
        return bAdapt;
    }

    public H264Properties setbAdapt(int bAdapt) {
        this.bAdapt = bAdapt;
        return this;
    }

    public int getDp() {
        return dp;
    }

    public H264Properties setDp(int dp) {
        this.dp = dp;
        return this;
    }

    public int getBrate() {
        return brate;
    }

    public H264Properties setBrate(int brate) {
        this.brate = brate;
        return this;
    }

    public boolean isbFrameBias() {
        return bFrameBias;
    }

    public H264Properties setbFrameBias(boolean bFrameBias) {
        this.bFrameBias = bFrameBias;
        return this;
    }

    public int getCrf() {
        return crf;
    }

    public H264Properties setCrf(int crf) {
        this.crf = crf;
        return this;
    }

    public int getQpStep() {
        return qpStep;
    }

    public H264Properties setQpStep(int qpStep) {
        this.qpStep = qpStep;
        return this;
    }

    public int getPbRatio() {
        return pbRatio;
    }

    public H264Properties setPbRatio(int pbRatio) {
        this.pbRatio = pbRatio;
        return this;
    }

    public int getChromaOffset() {
        return chromaOffset;
    }

    public H264Properties setChromaOffset(int chromaOffset) {
        this.chromaOffset = chromaOffset;
        return this;
    }

    public float getRateTol() {
        return rateTol;
    }

    public H264Properties setRateTol(float rateTol) {
        this.rateTol = rateTol;
        return this;
    }

    public byte getPass() {
        return pass;
    }

    public H264Properties setPass(byte pass) {
        this.pass = pass;
        return this;
    }

    public boolean isStats() {
        return stats;
    }

    public H264Properties setStats(boolean stats) {
        this.stats = stats;
        return this;
    }

    public int getDirect() {
        return direct;
    }

    public H264Properties setDirect(int direct) {
        this.direct = direct;
        return this;
    }

    public int getMeRange() {
        return meRange;
    }

    public H264Properties setMeRange(int meRange) {
        this.meRange = meRange;
        return this;
    }

    public boolean isWeightB() {
        return weightB;
    }

    public H264Properties setWeightB(boolean weightB) {
        this.weightB = weightB;
        return this;
    }


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

        public H264Properties build() {
            H264Properties h264Properties = new H264Properties();
            h264Properties.setbAdapt(this.bAdapt);
            //...
            return h264Properties;
        }
    }
}
