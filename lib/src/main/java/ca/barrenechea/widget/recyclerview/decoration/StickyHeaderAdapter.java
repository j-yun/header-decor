/*
 * Copyright 2014 Eduardo Barrenechea
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ca.barrenechea.widget.recyclerview.decoration;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;

/**
 * The adapter to assist the {@link StickyHeaderDecoration} in creating and binding the header
 * views.
 *
 * @param <T> the header view holder
 */
public interface StickyHeaderAdapter<T extends RecyclerView.ViewHolder> {
    /**
     * Returns the header id for the item at the given position.
     *
     * @param position the item position
     * @return the header id
     */
    long getHeaderId(int position);

    /**
     * the feature available to use GridLayoutManager or FlexBoxLayoutManager
     * @param position th item position
     * @return for LinearLayoutManager -> {@link StickyHeaderDecoration#ABOVE_HEADER_AUTO}
     *         if above is header -> {@link StickyHeaderDecoration#ABOVE_HEADER_NO}
     *         else {@link StickyHeaderDecoration#ABOVE_HEADER_YES}
     */
    int hasHeaderAbove(int position);

    /**
     * Creates a new header ViewHolder.
     *
     * @param parent the header's view parent
     * @return a view holder for the created view
     */
    @NonNull
    T onCreateHeaderViewHolder(@NonNull ViewGroup parent);

    /**
     * Updates the header view to reflect the header data for the given position
     *
     * @param viewHolder the header view holder
     * @param position the header's item position
     */
    void onBindHeaderViewHolder(@NonNull T viewHolder, int position);
}
