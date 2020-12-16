package org.gnuhpc.bigdata.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

/** Created by gnuhpc on 2017/7/21. */
@Log4j2
@Getter
@Setter
public class TopicMeta {

  private String topicName;
  private boolean internal;
  private int partitionCount;
  private int replicationFactor;
  private List<CustomTopicPartitionInfo> topicPartitionInfos;

  public TopicMeta(String topicName) {
    this.topicName = topicName;
  }
}
