/*
 * Copyright 2014-2015 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kaaproject.kaa.common.dto.plugin;

import org.kaaproject.kaa.common.dto.HasId;

import java.io.Serializable;
import java.util.Set;

public class ContractDto implements HasId, Serializable {

    private static final long serialVersionUID = 7031333692518444219L;

    private String id;
    private String name;
    private Integer version;
    private ContractType type;
    private Set<ContractItemDto> contractItems;
    private Set<PluginContractDto> pluginContracts;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ContractType getType() {
        return type;
    }

    public void setType(ContractType type) {
        this.type = type;
    }

    public Set<ContractItemDto> getContractItems() {
        return contractItems;
    }

    public void setContractItems(Set<ContractItemDto> contractItems) {
        this.contractItems = contractItems;
    }

    public Set<PluginContractDto> getPluginContracts() {
        return pluginContracts;
    }

    public void setPluginContracts(Set<PluginContractDto> pluginContracts) {
        this.pluginContracts = pluginContracts;
    }
}
