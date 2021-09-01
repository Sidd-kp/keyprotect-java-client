/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.ibm_key_protect_api.v2.model;

import com.ibm.cloud.ibm_key_protect_api.v2.model.CollectionMetadata;
import com.ibm.cloud.ibm_key_protect_api.v2.model.GetInstancePoliciesOneOf;
import com.ibm.cloud.ibm_key_protect_api.v2.model.GetInstancePoliciesOneOfGetInstancePolicyAllowedNetworkResourcesItem;
import com.ibm.cloud.ibm_key_protect_api.v2.model.GetInstancePoliciesOneOfGetInstancePolicyAllowedNetworkResourcesItemPolicyData;
import com.ibm.cloud.ibm_key_protect_api.v2.model.GetInstancePoliciesOneOfGetInstancePolicyAllowedNetworkResourcesItemPolicyDataAttributes;
import com.ibm.cloud.ibm_key_protect_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetInstancePoliciesOneOf model.
 */
public class GetInstancePoliciesOneOfTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  // TODO: Add tests for models that are abstract
  @Test
  public void testGetInstancePoliciesOneOf() throws Throwable {
    GetInstancePoliciesOneOf getInstancePoliciesOneOfModel = new GetInstancePoliciesOneOf();
    assertNotNull(getInstancePoliciesOneOfModel);
  }
}