package com.cursor.cursor.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;


public class Producer<S, S1> {

    private KafkaProducer<String, String> kafkaProducer;
    private final AtomicBoolean closed = new AtomicBoolean(false);
    Properties props = new Properties();

    public Producer(Properties props)
    {

        this.props.put("bootstrap.servers", "localhost:9092");
        this.props.put("acks", "all");
        this.props.put("retries", 0);
        this.props.put("group_id", "test_group");
        this.props.put("client.id", "Producer");
        this.props.put("enable.auto.commit","true");
        this.props.put("batch.size", 16384);
        this.props.put("linger.ms", 1);
        this.props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        this.props.put("value.serializer","org.apache.kafka.common.serialization.StringSerializer");

    }

    private KafkaProducer<String, String> getKafkaProducer() throws Exception {
        if (this.kafkaProducer == null) {
            this.kafkaProducer = new KafkaProducer<>(props);
        }
        return this.kafkaProducer;
    }

    public void shutdown() throws Exception {
        closed.set(true);
        getKafkaProducer().close();
    }

}
