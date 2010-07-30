/*
 * Copyright 2009 GBIF. Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.gbif.ipt.model;

import java.io.Serializable;
import java.util.UUID;

/**
 * Encapsulates all the information for an Organisation (brief mode)
 */
public class BriefOrganisation implements Serializable {

  private UUID key2;
  private String key;
  private String name;
  private String password;
  private String alias;

  /**
   * @return the alias
   */
  public String getAlias() {
    return alias;
  }

  /**
   * @return the key
   */
  public String getKey() {
    return key;
  }

  public UUID getKey2() {
    return key2;
  }

  /**
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param alias the alias to set
   */
  public void setAlias(String alias) {
    this.alias = alias;
  }

  /**
   * @param key the key to set
   */
  public void setKey(String key) {
    this.key = key;
  }

  public void setKey2(UUID key2) {
    this.key2 = key2;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

}