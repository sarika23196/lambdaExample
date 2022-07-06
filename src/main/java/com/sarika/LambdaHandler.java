package com.sarika;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;

public class LambdaHandler {

    public String handleRequest(String input, Context context) {

            PublishRequest request = new PublishRequest("arn:aws:sns:us-west-2:309901561626:Offers", "HI there, Dekho m Padh rha hu", "Meri Padhai ka Proof");
            AmazonSNS snsClient = AmazonSNSClient.builder().withRegion("us-west-2").build();
            PublishResult publishResult = snsClient.publish(request);


            return "Hello - " + input;
    }
}
