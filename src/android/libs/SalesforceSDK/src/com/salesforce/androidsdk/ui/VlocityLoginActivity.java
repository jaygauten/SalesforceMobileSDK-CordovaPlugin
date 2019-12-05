package com.salesforce.androidsdk.ui;

import android.content.Intent;

import com.salesforce.androidsdk.accounts.UserAccount;
import com.salesforce.androidsdk.app.SalesforceSDKManager;

public class VlocityLoginActivity extends LoginActivity {
    @Override
    public void finish(UserAccount userAccount) {
        super.finish(userAccount);
        Intent mainActivityIntent = new Intent(this, SalesforceSDKManager.getInstance().getMainActivityClass());
        startActivity(mainActivityIntent);
    }
}
