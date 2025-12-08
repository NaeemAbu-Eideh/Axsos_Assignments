import React from 'react';

const Divs = (props)=>{
    const {tags} = props;
    console.log("tags = ", tags );
    return (
        <div className="w-350 mx-auto mt-10">
            {
                tags.map((tag)=>
                    <div style={{backgroundColor: tag}} className="inline-block ml-3 mb-3 w-100 h-150"></div>
                )
            }
        </div>
    );
}

export default Divs;