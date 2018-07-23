   public String CheckSettings(int a, int b) {
        if (a == 1920 && b == 1080) {
            return "1080p";
        } else if (a == 1280 && b == 720) {
            return "720p";
        } else {
            return "Unsupported resolution";
        }
    }