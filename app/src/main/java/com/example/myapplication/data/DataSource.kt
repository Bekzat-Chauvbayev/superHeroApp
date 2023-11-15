/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.myapplication.data

import com.example.myapplication.R
import com.example.myapplication.model.Topic

object DataSource {
    val topics = listOf(
        Topic(R.string.architecture, 58, R.drawable.lemon_drink),
        Topic(R.string.crafts, 121, R.drawable.lemon_drink),
        Topic(R.string.business, 78, R.drawable.lemon_drink),
        Topic(R.string.culinary, 118, R.drawable.lemon_drink),
        Topic(R.string.design, 423, R.drawable.lemon_drink),
        Topic(R.string.fashion, 92, R.drawable.lemon_drink),
        Topic(R.string.film, 165, R.drawable.lemon_drink),
        Topic(R.string.gaming, 164, R.drawable.lemon_drink),
        Topic(R.string.drawing, 326, R.drawable.lemon_drink),
        Topic(R.string.lifestyle, 305, R.drawable.lemon_drink),
        Topic(R.string.music, 212, R.drawable.lemon_drink),
        Topic(R.string.painting, 172, R.drawable.lemon_drink),
        Topic(R.string.photography, 321, R.drawable.lemon_drink),
        Topic(R.string.tech, 118, R.drawable.lemon_drink)
    )
}
