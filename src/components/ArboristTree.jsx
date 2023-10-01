import { Tree } from "react-arborist";
import { createElement } from "react";

export function ArboristTree({ data }) {
    return (
        <div className="arborist-tree-widget">
            <Tree initialData={data} />
        </div>
    );
}
