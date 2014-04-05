package jp.fkmsoft.libs.kiilib.apis;

import org.json.JSONObject;

/**
 * Exception of Kii Cloud
 */
public class KiiException extends Exception {

    private int mStatus;
    private JSONObject mBody;

    public KiiException(int status, JSONObject body) {
        super();
        this.mStatus = status;
        this.mBody = body;
    }

    /**
     * Gets the HTTP status code
     * @return HTTP status code
     */
    public int getStatus() {
        return mStatus;
    }

    /**
     * Gets the body of response
     * @return response
     */
    public JSONObject getBody() {
        return mBody;
    }
}
