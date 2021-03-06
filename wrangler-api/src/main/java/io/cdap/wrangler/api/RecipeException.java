/*
 *  Copyright © 2017-2019 Cask Data, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 */

package io.cdap.wrangler.api;

/**
 * A {@link io.cdap.wrangler.api.RecipePipeline} specific exception used for
 * communicating issues with execution of pipeline.
 */
public class RecipeException extends Exception {
  public RecipeException(Exception e) {
    super(e);
  }

  public RecipeException(String message) {
    super(message);
  }

  public RecipeException(String message, Throwable throwable) {
    super(message, throwable);
  }
}

